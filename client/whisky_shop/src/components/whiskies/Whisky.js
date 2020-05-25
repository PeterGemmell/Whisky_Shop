import React, {Component} from 'react';
import {Link} from 'react-router-dom';


class Whisky extends Component {

  constructor(props){
    super(props)
  }

  render(){
    return(

      <div className="items">
      <img src={this.props.whisky.imgLink} width="300"></img>
      <div className="info">
      <p><b><u>{this.props.whisky.distilleryName}</u></b></p>
      <p><i>Name </i>{this.props.whisky.productName}</p>
      <p><i>Region </i>{this.props.whisky.region}</p>
      <p><i>Strength </i>{this.props.whisky.strength}</p>
      <p><i>Volume </i>{this.props.whisky.volume}</p>
      <p> £ {this.props.whisky.retailPrice} </p>
      </div>
      </div>

    )
  }
}


export default Whisky;
