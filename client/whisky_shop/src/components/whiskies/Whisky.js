import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import DistilleryMap from './WhiskyMap.js';


class Whisky extends Component {

  constructor(props){
    super(props);
    this.handleAddToCart = this.handleAddToCart.bind(this);

  }

  handleAddToCart(e){
    this.props.addToCart(this.props.whisky);
  }

  render(){
    return(

      <div className="items">
      <img src={this.props.whisky.imgLink} width="300"></img>
      <DistilleryMap distillery={this.props.whisky.distilleryName} latitude={this.props.whisky.latitude} longitude={this.props.whisky.longitude} />
      <div className="info">
      <p><b><u>{this.props.whisky.distilleryName}</u></b></p>
      <p><b>Name </b>{this.props.whisky.productName}</p>
      <p><b>Region </b>{this.props.whisky.region}</p>
      <p><b>Strength </b>{this.props.whisky.strength}</p>
      <p><b>Volume </b>{this.props.whisky.volume}</p>
      <p><b>Product Info</b></p>
      <p> {this.props.whisky.productInfo} </p>
      <span>£ {this.props.whisky.retailPrice}</span>
      <button onClick={this.handleAddToCart}
      disabled={this.props.whisky.inCart}
      className={this.props.whisky.inCart ? "button-disabled" : ""}>
      {this.props.whisky.inCart ? "Item in cart" : "Add to cart"}
      </button>
      <br></br>
       </div>
      </div>
    )
  }
}


export default Whisky;
