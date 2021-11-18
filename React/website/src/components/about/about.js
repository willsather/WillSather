import './about.css'
import picture from '../../graphics/about_large.jpg'

function About() {
    return (
        <div className="about-page">
            <h1 className="about-title">
                ABOUT
            </h1>

            <div className="about-body">
                hi, i'm will.
            </div>

            <div class="flex">

                <div className="about-paragraph">
                    i am a senior at university of minnesota studying computer science, purusing a
                    career as a solutions architect or a software engineer.

                    <br></br>
                    <br></br>
                    <br></br>
                    
                    outside of the experience on my resume, i have some personal work with html, react,
                    and javascript through the personal websites and app development over the past few years.  
                    professionally, i have worked with on front end development at ivanti when i worked on their
                    cloud platform.  this entailed working with angular and devextreme on the frontend fully integrating
                    our product as a service into ivanti's larger PaaS.   
                
                </div>

                <div class="picture">
                    <img src={picture} alt="Will Sather" />
                </div>

            </div>
        </div>
    );
  }
  
  export default About;
  