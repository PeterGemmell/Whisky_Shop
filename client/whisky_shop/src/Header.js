import React , {Component} from 'react';
import Whisky from './components/whiskies/Whisky.js';
import ShoppingCart from  './components/cart/ShoppingCart.js';


class Header extends Component {


  render(){
    return(
      <header className="new-header">
      <ShoppingCart quantity={this.props.quantity}
      amountToPay={this.props.amountToPay} />
      </header>
    )
  }
}


export default Header;
