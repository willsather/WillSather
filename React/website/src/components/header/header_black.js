import './header_black.css'

import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import logo from '../../graphics/logo_white.png'

function Header() {
  return (
    <header className="header_black">
        <div>
          <a href="/" className="logo_white">
            <img src={logo} alt="Will Sather" href="/" width="100" height="100"/>
          </a>
        </div>

        <ul id="nav">
          <li>
            <Link to="/" Style="color:white">Home</Link>
          </li>
          <li>
            <Link to="/experience" Style="color:white">Experience</Link>
          </li>
          <li>
            <Link to="/about" Style="color:white">About</Link>
          </li>
        </ul>

    </header>
  );
}

export default Header;