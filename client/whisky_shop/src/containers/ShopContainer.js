import React, {Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js'
import WhiskyContainer from './WhiskyContainer';
import LoginContainer from './LoginContainer';
import AboutContainer from './AboutContainer';


const ShopContainer = () => {
    return(
      <Router>
      <Fragment>
      <NavBar/>
      <Switch>
      <Route path="/login" component={LoginContainer} />
      <Route path="/whiskies" component={WhiskyContainer} />
      <Route path="/about" component={AboutContainer} />
      </Switch>
      </Fragment>
      </Router>
    )
  }




export default ShopContainer;
