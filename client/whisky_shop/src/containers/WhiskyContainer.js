import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import WhiskyList from '../components/whiskies/WhiskyList'
import Request from '../helpers/request'
import WhiskyDetail from '../components/whiskies/WhiskyDetail'
import Whisky from '../components/whiskies/Whisky'


class WhiskyContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      whiskies: []
    }

    this.findWhiskyById = this.findWhiskyById.bind(this);
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
        return <WhiskyList whiskies={this.state.whiskies} />
      }} />
      </Switch>
      </Fragment>
      </Router>
    )
  }






}


export default WhiskyContainer;
