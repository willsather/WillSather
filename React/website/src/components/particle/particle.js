import './particle.css'
import Particles from 'react-particles-js'

function Particle(){
    return (
        <div>
            <Particles id="particle"
                style={{ position: "absolute" }}
                params={{
                    particles: {
                    color: {
                        value: "#000000"
                    },
                    line_linked: {
                        color: {
                        value: "#c5c5c5"
                        }
                    },
                    number: {
                        value: 100
                    },
                    size: {
                        value: 1
                    }
                    }
                }}
                />
        </div>
    );
  }
  
  export default Particle;
  