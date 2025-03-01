package com.bm.coinmanagement.utility;

import com.bm.coinmanagement.coin.Coin;
import com.bm.coinmanagement.dao.CoinDAO;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

public class Utilities implements CoinDAO {
    public static Scanner sc = new Scanner(System.in);

    @Override
    public void addCoin(List<Coin> coins, List<Coin> originalCoins) {

        sc.nextLine();
        System.out.println("Enter the details of coin: ");

        // Get country name
        System.out.println("Enter Country name of Coin: ");
        String countryName = sc.nextLine();

        // Get coin denomination with validation
        double denom = 0.0;
        while (true) {
            System.out.println("Enter Coin denomination value (Double 0.0): ");
            if (sc.hasNextDouble()) {
                denom = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid coin denomination.");
                sc.next(); // Clear invalid input
            }
        }

        // Get coin year of mint with validation
        int mintYear = 0;
        while (true) {
            System.out.println("Enter Coin Year of Mint (YYYY 2002): ");
            if (sc.hasNextInt()) {
                mintYear = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid year (e.g., 2002): ");
                sc.next(); // Clear invalid input
            }
        }

        // Get coin current value with validation
        double curVal = 0.0;
        while (true) {
            System.out.println("Enter Coin Current value (Double 0.0): ");
            if (sc.hasNextDouble()) {
                curVal = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid current value.");
                sc.next(); // Clear invalid input
            }
        }

        // Handle coin acquisition date
        LocalDate acqDate;
        System.out.println("Is the coin acquired today? (1 for Yes / 2 for No): ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()

        if (choice == 1) {
            acqDate = LocalDate.now();
        } else if (choice == 2) {
            System.out.println("Enter acquired Date (String ddmmyyyy) without spaces eg. 11 oct 2002 = 11102002:  ");
            String acqDateString = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            try {
                acqDate = LocalDate.parse(acqDateString, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format! Defaulting to today's date.");
                acqDate = LocalDate.now();
            }
        } else {
            System.out.println("Invalid choice. Defaulting to today's date.");
            acqDate = LocalDate.now();
        }

        // Create and add the new Coin object to the list
        coins.add(new Coin(denom, countryName, mintYear, curVal, acqDate));

    }


    @Override
    public void updateCoin(List<Coin> updateCoins, List<Coin> originalCoins) {
        System.out.println("Enter the Id of the coin to be updated: ");
        int id = sc.nextInt();

        // Find the coin with the specified ID in the originalCoins list
        Coin coinToUpdate = null;
        for (Coin coin : originalCoins) {
            if (coin.getId() == id) {
                coinToUpdate = coin;
                break;
            }
        }

        // If the coin is found, update its properties
        if (coinToUpdate != null) {
            originalCoins.remove(coinToUpdate);
            // Input new values for the coin properties
            System.out.println("Enter new Country name for Coin (Current: " + coinToUpdate.getCountry() + "): ");
            sc.nextLine();  // Consume the newline character left by nextInt()
            String countryName = sc.nextLine();

            System.out.println("Enter new Denomination value for Coin (Current: " + coinToUpdate.getDenomination() + "): ");
            double denom = sc.nextDouble();

            System.out.println("Enter new Year of Mint for Coin (Current: " + coinToUpdate.getYearOfMint() + "): ");
            int mintYear = sc.nextInt();

            System.out.println("Enter new Current value for Coin (Current: " + coinToUpdate.getCurrentValue() + "): ");
            double curVal = sc.nextDouble();

            System.out.println("Is the coin acquired today? (1 for Yes / 2 for No, Current Acquired Date: " + coinToUpdate.getAcquiredDate() + "): ");
            int choice = sc.nextInt();
            LocalDate acqDate;

            if (choice == 1) {
                acqDate = LocalDate.now();
            } else {
                sc.nextLine();  // Consume the newline character left by nextInt()
                System.out.println("Enter new acquired Date (String ddmmyyyy, Current: " + coinToUpdate.getAcquiredDate() + "): ");
                String acqDateString = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                try {
                    acqDate = LocalDate.parse(acqDateString, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format! Defaulting to today's date.");
                    acqDate = LocalDate.now();
                }
            }

            // Update the coin's details
            coinToUpdate.setCountry(countryName);
            coinToUpdate.setDenomination(denom);
            coinToUpdate.setYearOfMint(mintYear);
            coinToUpdate.setCurrentValue(curVal);
            coinToUpdate.setAcquiredDate(acqDate);

            // Add the updated coin to the updateCoins list
            updateCoins.add(coinToUpdate);
            originalCoins.add(coinToUpdate);

            System.out.println("Coin with ID " + id + " has been updated.");
        } else {
            System.out.println("Coin with ID " + id + " not found.");
        }
    }


    @Override
    public void deleteCoin(List<Coin> delCoins, List<Coin> originalCoins) {
        System.out.println("Enter Id of coin from above list to be deleted: ");
        int id = sc.nextInt();

        // Find the coin with the specified ID in originalCoins
        Coin coinToDelete = null;
        for (Coin coin : originalCoins) {
            if (coin.getId() == id) {
                coinToDelete = coin;
                break; // Exit the loop once the coin is found
            }
        }

        // If the coin is found, add it to delCoins and remove it from originalCoins
        if (coinToDelete != null) {
            delCoins.add(coinToDelete); // Add to the delete list
            originalCoins.remove(coinToDelete); // Remove from the original list
            System.out.println("Coin with ID " + id + " has been deleted.");
        } else {
            System.out.println("Coin with ID " + id + " not found.");
        }
    }


    @Override
    public List<Coin> getAllCoins(Connection connection) {

        List<Coin> coinList = new ArrayList<>();
        String sql = "SELECT * FROM coin_collection;";

        try {
            if (connection != null) {
                Statement st = connection.createStatement();
                ResultSet res = st.executeQuery(sql);

                // Map ResultSet to Coin objects and store in ArrayList
                while (res.next()) {
                    int id = res.getInt("id");
                    String country = res.getString("country");
                    double denomination = res.getDouble("denomination");
                    int yearOfMint = res.getInt("year_of_mint");
                    double currentValue = res.getDouble("current_value");
                    LocalDate acquiredDate = res.getDate("acquired_date").toLocalDate();

                    // Create Coin object
                    Coin coin = new Coin(denomination, id, country, yearOfMint, currentValue, acquiredDate);

                    // Add to the list
                    coinList.add(coin);
                }
                return coinList;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean commitChanges(Connection con, List<Coin> insCoins, List<Coin> delCoins, List<Coin> updateCoins) {
        String insertSQL = "INSERT INTO coin_collection (country, denomination, year_of_mint, current_value, acquired_date) VALUES (?, ?, ?, ?, ?)";
        String deleteSQL = "DELETE FROM coin_collection WHERE id = ?";
        String updateSQL = "UPDATE coin_collection SET country = ?, denomination = ?, year_of_mint = ?, current_value = ?, acquired_date = ? WHERE id = ?";

        try {
            if (con != null) {
                con.setAutoCommit(false); // Begin transaction

                // Insert coins
                try (PreparedStatement insertStmt = con.prepareStatement(insertSQL)) {
                    for (Coin coin : insCoins) {
                        insertStmt.setString(1, coin.getCountry());
                        insertStmt.setDouble(2, coin.getDenomination());
                        insertStmt.setInt(3, coin.getYearOfMint());
                        insertStmt.setDouble(4, coin.getCurrentValue());
                        insertStmt.setDate(5, java.sql.Date.valueOf(coin.getAcquiredDate()));
                        insertStmt.addBatch(); // Add to batch
                    }
                    insertStmt.executeBatch(); // Execute batch insert
                }

                // Delete coins
                try (PreparedStatement deleteStmt = con.prepareStatement(deleteSQL)) {
                    for (Coin coin : delCoins) {
                        deleteStmt.setInt(1, coin.getId());
                        deleteStmt.addBatch(); // Add to batch
                    }
                    deleteStmt.executeBatch(); // Execute batch delete
                }

                // Update coins
                try (PreparedStatement updateStmt = con.prepareStatement(updateSQL)) {
                    for (Coin coin : updateCoins) {
                        updateStmt.setString(1, coin.getCountry());
                        updateStmt.setDouble(2, coin.getDenomination());
                        updateStmt.setInt(3, coin.getYearOfMint());
                        updateStmt.setDouble(4, coin.getCurrentValue());
                        updateStmt.setDate(5, java.sql.Date.valueOf(coin.getAcquiredDate()));
                        updateStmt.setInt(6, coin.getId());
                        updateStmt.addBatch(); // Add to batch
                    }
                    updateStmt.executeBatch(); // Execute batch update
                }
                insCoins.clear();
                updateCoins.clear();
                delCoins.clear();
                con.commit(); // Commit transaction
                return true; // Indicate success
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (con != null) {
                    con.rollback(); // Rollback on error
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true); // Reset auto-commit
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false; // Indicate failure
    }


    public void showAllAvailableCoins(List<Coin> coins) {
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("Coins in collection:");
        System.out.println("+----------+-----------------+-----------------+--------------+----------------+-----------------+");
        System.out.println(String.format("| %-8s | %-15s | %-15s | %-12s | %-14s | %-15s |", "Coin_ID", "Country", "Denomination", "Year of Mint", "Current Value", "Acquired Date"));
        System.out.println("|----------|-----------------|-----------------|--------------|----------------|-----------------|");


        for (Coin coin : coins) {
            System.out.println(coin);
//            System.out.println("ID: " + coin.getId() + ", Country: " + coin.getCountry() + ", Denomination: " + coin.getDenomination() + ", Year of Mint: " + coin.getYearOfMint() + ", Current Value: " + coin.getCurrentValue() + ", Acquired Date: " + coin.getAcquiredDate());

        }
        System.out.println("|__________|_________________|_________________|______________|________________|_________________|");
    }


    public int mainMenu() {

        System.out.println("\n__________________________________________________________________________________________________");
        System.out.println("1 ) : Show Available Collection\n" + "2 ) : Add Single Coin in collection\n" + "3 ) : Delete Single Coin from collection\n" + "4 ) : Update Single Coin in collection\n" + "5 ) : Add Multiple Coins in collection\n" + "6 ) : Add Coins in collection from CSV\n" + "7 ) : Save Current State in Database\n" + "8 ) : Search Sort \n" + "0 ) : Exit by saving changes");
        System.out.println("__________________________________________________________________________________________________");

        return getValidIntInput(0, 8, "Enter your choice: ");
    }

    public LocalDate convertStringToLocalDate(String dateStr) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        return LocalDate.parse(dateStr, formatter);
    }


    public void searchSort(List<Coin> coinList) {
        while (true) {
            System.out.println("\nSearch/Sort Menu");
            System.out.println("1. Search by Country");
            System.out.println("2. Search by Year of Minting");
            System.out.println("3. Search by Current Value (Sorted)");
            System.out.println("4. Search by Country + Denomination");
            System.out.println("5. Search by Country + Year of Minting");
            System.out.println("6. Search by Country + Denomination + Year of Minting");
            System.out.println("7. Search by Acquired Date + Country");
            System.out.println("8. Sort by Country");
            System.out.println("9. Sort by Year of Minting");
            System.out.println("10. Sort by Current Value (Descending)");
            System.out.println("11. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = getValidIntInput(1, 12, "Enter your choice: ");

            switch (choice) {
                case 1:
                    this.searchByCountry(coinList);
                    break;
                case 2:
                    this.searchByYearOfMinting(coinList);
                    break;
                case 3:
                    this.sortByCurrentValue(coinList, true); // Ascending order
                    break;
                case 4:
                    this.searchByCountryDenomination(coinList);
                    break;
                case 5:
                    this.searchByCountryYear(coinList);
                    break;
                case 6:
                    this.searchByAllThree(coinList);
                    break;
                case 7:
                    this.searchByAcquiredDateCountry(coinList);
                    break;
                case 8:
                    this.sortByCountry(coinList);
                    break;
                case 9:
                    this.sortByYearOfMinting(coinList);
                    break;
                case 10:
                    this.sortByCurrentValue(coinList, false); // Descending order
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void searchByCountry(List<Coin> coinList) {
        System.out.print("Enter the country: ");
        String country = sc.next();
        List<Coin> filteredList = coinList.stream().filter(coin -> coin.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());
        if (filteredList.isEmpty()) {
            System.out.println("No coins found for that country.");
        } else {
            System.out.println("\nSearch Results (By Country):");
            this.showAllAvailableCoins(filteredList);
        }
    }

    private void searchByYearOfMinting(List<Coin> coinList) {
        System.out.print("Enter the year of minting: ");
        int year = sc.nextInt();
        List<Coin> filteredList = coinList.stream().filter(coin -> coin.getYearOfMint() == year).collect(Collectors.toList());
        if (filteredList.isEmpty()) {
            System.out.println("No coins found for that year of minting.");
        } else {
            System.out.println("\nSearch Results (By Year of Minting):");
            this.showAllAvailableCoins(filteredList);
        }
    }


    private void searchByCountryDenomination(List<Coin> coinList) {
        System.out.print("Enter the country: ");
        String country = sc.next();
        System.out.print("Enter the denomination: ");
        double denomination = sc.nextDouble();
        List<Coin> filteredList = coinList.stream().filter(coin -> coin.getCountry().equalsIgnoreCase(country) && coin.getDenomination() == denomination).collect(Collectors.toList());
        if (filteredList.isEmpty()) {
            System.out.println("No coins found for that country and denomination.");
        } else {
            System.out.println("\nSearch Results (By Country + Denomination):");
            this.showAllAvailableCoins(filteredList);
        }
    }

    private void sortByCurrentValue(List<Coin> coinList, boolean ascending) {
        coinList.sort((coin1, coin2) -> {
            if (ascending) {
                return Double.compare(coin1.getCurrentValue(), coin2.getCurrentValue());
            } else {
                return Double.compare(coin2.getCurrentValue(), coin1.getCurrentValue());
            }
        });
        this.showAllAvailableCoins(coinList);
    }

    private void searchByCountryYear(List<Coin> coinList) {
        System.out.print("Enter the country: ");
        String country = sc.next();
        System.out.print("Enter the year of minting: ");
        int year = sc.nextInt();
        List<Coin> filteredList = coinList.stream().filter(coin -> coin.getCountry().equalsIgnoreCase(country) && coin.getYearOfMint() == year).collect(Collectors.toList());
        if (filteredList.isEmpty()) {
            System.out.println("No coins found for that country and year.");
        } else {
            System.out.println("\nSearch Results (By Country + Year):");
            this.showAllAvailableCoins(filteredList);
        }
    }

    private void searchByAllThree(List<Coin> coinList) {
        System.out.print("Enter the country: ");
        String country = sc.next();
        System.out.print("Enter the denomination: ");
        double denomination = sc.nextDouble();
        System.out.print("Enter the year of minting: ");
        int year = sc.nextInt();
        List<Coin> filteredList = coinList.stream().filter(coin -> coin.getCountry().equalsIgnoreCase(country) && coin.getDenomination() == denomination && coin.getYearOfMint() == year).collect(Collectors.toList());
        if (filteredList.isEmpty()) {
            System.out.println("No coins found matching all criteria.");
        } else {
            System.out.println("\nSearch Results (By Country + Denomination + Year):");
            this.showAllAvailableCoins(filteredList);
        }
    }

    private void searchByAcquiredDateCountry(List<Coin> coinList) {
        System.out.print("Enter the acquired date (YYYY-MM-DD): ");
        String dateString = sc.next();
        System.out.print("Enter the country: ");
        String country = sc.next();

        try {
            LocalDate acquiredDate = LocalDate.parse(dateString);
            List<Coin> filteredList = coinList.stream().filter(coin -> coin.getAcquiredDate().equals(acquiredDate) && coin.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());

            if (filteredList.isEmpty()) {
                System.out.println("No coins found for that acquired date and country.");
            } else {
                System.out.println("\nSearch Results (By Acquired Date + Country):");
                this.showAllAvailableCoins(filteredList);
            }
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        }
    }

    private void sortByCountry(List<Coin> coinList) {
        coinList.sort(Comparator.comparing(Coin::getCountry));
        System.out.println("\nSorted by Country:");
        this.showAllAvailableCoins(coinList);
    }

    private void sortByYearOfMinting(List<Coin> coinList) {
        coinList.sort(Comparator.comparingInt(Coin::getYearOfMint));
        System.out.println("\nSorted by Year of Minting:");
        this.showAllAvailableCoins(coinList);
        this.showAllAvailableCoins(coinList);
    }

    public static int getValidIntInput(int min, int max, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt); // Display the prompt
            try {
                input = sc.nextInt();
                if (input >= min && input <= max) {
                    return input; // Valid input, return it
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + " (inclusive).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input from the scanner
            }
        }
    }

    
    
    
    
}
