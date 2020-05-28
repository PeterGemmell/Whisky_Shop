import React, {Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js'
import WhiskyContainer from './WhiskyContainer';
import LoginContainer from './LoginContainer';
import AboutContainer from './AboutContainer';
import AgeContainer from './AgeContainer'; //remove if wrong


const ShopContainer = () => {
    return(
      <Router>
      <Fragment>
      <NavBar/>
      <Switch>
      <Route path="/age" component={AgeContainer} /> //remove if wrong.
      <Route path="/login" component={LoginContainer} />
      <Route path="/whiskies" component={WhiskyContainer} />
      <Route path="/about" component={AboutContainer} />
      </Switch>
      </Fragment>
      </Router>
    )
  }




export default ShopContainer;
