import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import DistilleryMap from './WhiskyMap.js';


class Whisky extends Component {

  constructor(props){
    super(props)
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
      <p> £ {this.props.whisky.retailPrice} </p>
      <p><b>Product Info</b></p>
      <p> {this.props.whisky.productInfo} </p>
      </div>
      </div>

    )
  }
}


export default Whisky;
