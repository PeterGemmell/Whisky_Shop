import React, {Component} from 'react';
import {Map, Marker, Popup, TileLayer} from 'react-leaflet';
import {Icon} from "leaflet"

const DistilleryMap = (props) => {
  return (
    <Map center={[props.latitude, props.longitude]} zoom={11}>
    <TileLayer
      url='https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png'
      attribution='Distillery Map'
      />

      <Marker position={[props.latitude, props.longitude]}>
      <Popup>
      <p><b>The {props.distillery} Distillery</b></p>
      </Popup>
      </Marker>
    </Map>

  );
}

export default DistilleryMap;
