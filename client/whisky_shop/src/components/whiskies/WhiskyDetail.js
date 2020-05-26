import React, {Component} from 'react';
import Whisky from './Whisky'


class WhiskyDetail extends Component {

   constructor(props){
     super(props)
   }

   render(){
     if(!this.props.whisky){
       return "Loading..."
     }
     return (
       <div className= "items">

       <img src={this.props.whisky.imgLink} alt="image"/>

       <h1> {this.props.whisky.distilleryName} </h1>
       <h1> {this.props.whisky.productName} </h1>
       <h1> {this.props.whisky.region} </h1>
       <h2> {this.props.whisky.strength} </h2>
       <h2> {this.props.whisky.volume} </h2>
       <h2> £{this.props.whisky.retailPrice} </h2>
       <h2> {this.props.whisky.productInfo} </h2>
       </div>
     )
   }
 }

 // remember you need to add QTY in above the retail price.


 export default WhiskyDetail;
