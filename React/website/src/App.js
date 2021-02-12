import React from 'react'
import Particles from 'react-particles-js'

import Header from './components/header/header'
import Body from './components/body/body'
import Particle from './components/particle/particle';

function App() {
  return (
    <div className="website">
        <Particle /> 
        <Header /> 
        <Body />
    </div>
    
  );
}

export default App;
