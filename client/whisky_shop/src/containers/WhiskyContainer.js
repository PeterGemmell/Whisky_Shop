import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import WhiskyList from '../components/whiskies/WhiskyList'
import Request from '../helpers/request'
import WhiskyDetail from '../components/whiskies/WhiskyDetail'
import Whisky from '../components/whiskies/Whisky'
import ShoppingCartOverlay from '../components/cart/ShoppingCartOverlay'
import ShoppingCartProduct from '../components/cart/ShoppingCartProduct'
import ShoppingCart from '../components/cart/ShoppingCart'
import Header from '../Header.js'

class WhiskyContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      whiskies: [],
      quantity: 0,
      amountToPay: 0,
      itemsInCart: []
    }
    this.addToCart = this.addToCart.bind(this);
    this.removeFromCart = this.removeFromCart.bind(this);
    this.findWhiskyById = this.findWhiskyById.bind(this);
  }
  addToCart(whisky){
    let tempCart = this.state.itemsInCart;
    tempCart.push(this.state.whiskies[whisky.id]); // possible -1
    this.state.whiskies[whisky.id].inCart = true; // commenting out removes red on button.
    this.state.whiskies[whisky.id].quantityInCart = 1;
    this.setState({
      quantity: this.state.quantity +1,
      amountToPay: this.state.amountToPay - this.state.whiskies[whisky.id].retailPrice,
      itemsInCart: tempCart
    });
  }

  removeFromCart(whisky, indexInCart) {
    let tempCartRemove = this.state.itemsInCart;
    this.state.whiskies[whisky.id].inCart = false;
    this.state.whiskies[whisky.id].quantityInCart = 0;
    tempCartRemove.splice(indexInCart, 1);
    this.setState({
      quantity: this.state.quantity -1,
      amountToPay: this.state.amountToPay - this.state.whiskies[whisky.id].retailPrice,
      itemsInCart: tempCartRemove
    });
  }

  componentDidMount(){
    const request = new Request();

    request.get('/api/whiskies')
    .then((data) => {
      this.setState({whiskies: data})
    })
  }

  handlePost(whisky){
    const request = new Request();
    request.post('/api/whiskies', whisky)
    .then(() => {
      window.location = '/whiskies'
    })
  }

  findWhiskyById(id){
    return this.state.whiskies.find((whisky) => {
      return whisky.id === parseInt(id);
    });
  }

  render(){
    if(!this.state.whiskies){
      return null
    }

    return(
      <Router>
      <Fragment>
      <Switch>
      <Route render = {(props) => {
        return(
          <>
          <div>
          <Header quantity={this.state.quantity}
          amountToPay={this.state.amountToPay} />
          <ShoppingCartOverlay data ={this.state}
          removeFromCart={this.removeFromCart} />
          <WhiskyList whiskies={this.state.whiskies}
          itemsInCart={this.state.itemsInCart}
          addToCart={this.addToCart} />
          </div>
          </>
        )
      }} />
         </Switch>
       </Fragment>
      </Router>
    )
  }
}


export default WhiskyContainer;
