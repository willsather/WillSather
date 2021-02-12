import './header.css'

import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

import logo from '../../graphics/logo_black.png'

function Header() {
  return (
    <header className="header">
        <div>
          <a href="/" className="logo">
            <img src={logo} alt="Will Sather" href="/" width="100" height="100"/>
          </a>
        </div>

        <ul id="nav">
          <li>
            <Link to="/" Style="color:black">Home</Link>
          </li>
          <li>
            <Link to="/experience" Style="color:black">Experience</Link>
          </li>
          <li>
            <Link to="/about" Style="color:black">About</Link>
          </li>
        </ul>

    </header>
  );
}

export default Header;
