import React, {Component} from 'react';
import ShoppingCart from './components/cart/ShoppingCart.js';


const NavBar =(props) => {
    return(
      <header>
      <h1 className="title-header">THE DRAM</h1>

      <ul className="ul-links-bar">
      <li className="navLink">
      <a href="/whiskies">Whiskies</a>
      </li>

      <li className="navLink">
      <a href="/about">About</a>
      </li>

      <li className="navLink">
      <a href="/login">Login</a>
      </li>
      </ul>
      </header>

    )
}


export default NavBar;
