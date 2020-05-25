import React, {Component} from 'react';
import Whisky from './Whisky.js';

class WhiskyList extends Component {
  render(){
    let whiskies = this.props.whiskies.map((whisky, index) => {
      return <Whisky key={whisky.id}
             whisky={whisky}
             addToCart={this.props.addToCart} />

    });
    return (
      <section id="list">
      {whiskies}
      </section>
    )
  }
}


export default WhiskyList;
