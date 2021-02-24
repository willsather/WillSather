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
        
      <div class="flex">
        
        <div>
          <a href="/" className="logo">
            <img src={logo} alt="Will Sather" href="/" width="100" height="100"/>
          </a>
        </div>

        <ul class="nav_black" id="nav_black">
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
      </div>

    </header>
  );
}

export default Header;
