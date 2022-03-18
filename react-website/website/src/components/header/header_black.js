import './header_black.css'

import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import logo from '../../graphics/logo_white.png'

function HeaderBlack() {
  return (
    <header className="header_black">

      <div class="flex">
          
          <div>
              <a href="/" className="logo_white">
                <img src={logo} alt="Will Sather" href="/" width="100" height="100"/>
              </a>
          </div>

          <ul class="nav_white" id="nav_white">
            <li>
              <Link to="/" Style="color:white">home</Link>
            </li>
            <li>
              <Link to="/experience" Style="color:white">experience</Link>
            </li>
            <li>
              <a class="black_link" href="https://byt8.app" target="_blank">byt8</a>
            </li>
            <li>
              <Link to="/about" Style="color:white">about</Link>
            </li>
          </ul>
          
      </div>
    </header>
  );
}

export default HeaderBlack;