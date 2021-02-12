import './header.css'

import logo from '../../graphics/logo_black.png'

function Header() {
  return (
    <header className="header">
        <div>
            <section className="logo">
            <img src={logo} alt="Will Sather" width="100" height="100"/>
            </section>
        </div>
    </header>
  );
}

export default Header;
