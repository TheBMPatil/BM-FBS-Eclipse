import { displayCartItems } from "./displayCartItems";

export const { updateCart } = require("./updateCart");

const cartButton = document.getElementById('cart-button');
const cartModal = document.getElementById('cart-modal');
const closeCartButton = document.getElementById('close-cart');
export const cartItemsList = document.getElementById('cart-items');

export let cart = [];

document.querySelectorAll('.add-to-cart').forEach(button => {
	button.addEventListener('click', () => {
		const productName = button.getAttribute('data-name');
		const productPrice = button.getAttribute('data-price');

		cart.push({ name: productName, price: productPrice });
		updateCart();
	});
});

cartButton.addEventListener('click', () => {
	cartModal.classList.remove('hidden');
	displayCartItems();
});

closeCartButton.addEventListener('click', () => {
	cartModal.classList.add('hidden');
});

