import React, {Component} from 'react';
import Whisky from '../../components/whiskies/Whisky.js';

class ShoppingCartProduct extends Component {
  constructor(props){
    super(props);
    this.handleRemoveFromCart = this.handleRemoveFromCart.bind(this);
    this.handleQuantityChange = this.handleQuantityChange.bind(this);
  }

  handleRemoveFromCart(e){
    this.props.removeFromCart(this.props.whisky, this.props.indexInCart);
  }

  handleQuantityChange(e){
    this.props.whisky.quantityInCart = e.target.value;
    this.forceUpdate();
    this.props.updateAmountToPay(this.props.whisky);
  }


  render(){
    return(
      <tr className="items-in-cart">
      <td><img> src={this.props.whisky.imgLink}></img></td>
      <td>{this.props.whisky.productName}</td>
      <td>£{this.props.whisky.retailPrice}</td>
      <td>
      <input type="number" name="quantity" min="1" max="10" onChange={this.handleQuantityChange} />
      </td>
      <td>£{this.props.whisky.retailPrice * this.props.whisky.quantityInCart}</td>
      <td><p> <img src="./bin.png" className="bin-image" onClick={this.handleRemoveFromCart}/></p></td>
      </tr>
    )
  }
}


export default ShoppingCartProduct;
