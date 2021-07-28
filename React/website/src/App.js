import React from 'react'
import Particles from 'react-particles-js'
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import './app.css'
import logo_white from './graphics/logo_loading.gif'

import Header from './components/header/header'
import Header_Black from './components/header/header_black'
import Header_White from './components/header/header_white'
import Main from './components/main/main'
import Experience from './components/experience/experience'
import About from './components/about/about'
import Particle from './components/particle/particle';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/">
          <Particle particles="100" />
          <Header />
          <Main />
        </Route>
        <Route path="/experience">
          <Header_White />
          <Experience />
        </Route>
        <Route path="/about">
          <Header_Black />
          <About />
        </Route>
        <Route path="*">
          <Particle particles="100" />
          <Header />
          <Main />
        </Route>  
      </Switch>
  </Router>

  );
}

// Splash Screen
/*
document.addEventListener('DOMContentLoaded', (e)=>{
  setTimeout(()=>{
    document.getElementById("splash").style.opacity="0";
    document.getElementById("splash").style.zIndex=-10;
    document.getElementById("splash").style.transition='all .1s'; //2.3s

  }, 0) //2750
})
*/
export default App;
