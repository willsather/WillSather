import React from 'react'
import Particles from 'react-particles-js'
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import Header from './components/header/header'
import Body from './components/body/body'
import Experience from './components/experience/experience'
import About from './components/about/about'

import Particle from './components/particle/particle';

function App() {
  return (

    <Router>

      <Switch>
        <Route exact path="/">
          <Particle /> 
          <Header /> 
          <Body />
        </Route>
        <Route path="/experience">
          <Header /> 
          <Experience /> 
        </Route>
        <Route path="/about">
          <Header /> 
          <About /> 
        </Route>
      </Switch>
    
  </Router>

  );
}

export default App;
