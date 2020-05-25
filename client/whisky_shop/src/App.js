import React, {Component, Fragment} from 'react';
import ShopContainer from './containers/ShopContainer';
import WhiskyContainer from './containers/WhiskyContainer';
import ShoppingCart from './components/cart/ShoppingCart';
import ShoppingCartOverlay from './components/cart/ShoppingCartOverlay';
// import Dropdown from 'react-overlays/Dropdown';
import WhiskyList from './components/whiskies/WhiskyList';
import Whisky from './components/whiskies/Whisky';
import WhiskyDetail from './components/whiskies/WhiskyDetail';


class App extends Component {

  render(){
    return(

      <div>
      <ShopContainer />
      </div>
    );
  }
}


export default App;
