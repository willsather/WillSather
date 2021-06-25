import './header_white.css'

import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import logo from '../../graphics/logo_black.png'

function HeaderWhite() {
  return (
    <header className="header_white">
        
      <div class="flex">
        
        <div>
          <a href="/" className="logo">
            <img src={logo} alt="Will Sather" href="/" width="100" height="100"/>
          </a>
        </div>

        <ul class="nav_white" id="nav_white">
          <li>
            <Link to="/" Style="color:black">home</Link>
          </li>
          <li>
            <Link to="/experience" Style="color:black">experience</Link>
          </li>
          <li>
            <a class="white_link" href="https://byt8.app" target="_blank">byt8</a>
          </li>
          <li>
            <Link to="/about" Style="color:black">about</Link>
          </li>
        </ul>
      </div>

    </header>
  );
}

export default HeaderWhite;
