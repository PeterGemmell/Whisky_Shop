import React, {Component} from 'react';
import {Map, Marker, Popup, TileLayer} from 'react-leaflet';
import {Icon} from "leaflet"

const DistilleryMap = (props) => {
  return (
    <Map center={[40.730610,-73.935242]} zoom={12}>
    <TileLayer
      url='https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png'
      attribution='Josephs Map'
      />

      <Marker position={[40.730610,-73.935242]} draggable="true">
      <Popup>
      <p>Hello</p>
      </Popup>
      </Marker>
    </Map>

  );
}

export default DistilleryMap;
