import './experience.css'

function Experience() {
    
    return (
        <div className="experience-page">
            <h1 className="experience-title">
                EXPERIENCE
            </h1>

            <div className="experience-body">
                <a href="https://github.com/willsather/Will-Sather/blob/master/HTML/resume/2021%20Will%20Sather%20Resume%20(PDF).pdf" Style="color:grey" target="_blank">// check out my resume here</a>
            </div>

            <div className="experience-div">
                <ul id="experience-list">
                    <li> <span>Dell Technologies.</span>
                        <ol id="sub-list-position">
                            <li>Solutions Architect Intern.</li>
                        </ol>
                        <ol id="sub-list-description">
                            <li>ismv4 associate exam, dart, flutter, firebase.</li>
                        </ol>
                    </li>
                    
                    <li> <span>Ivanti.</span>
                        <ol id="sub-list-position">
                            <li>Software Engineer Intern.</li>
                        </ol> 

                        <ol id="sub-list-description">
                            <li>c#, azure devops, visual studio, ci build pipeline.</li>
                        </ol>
                    </li>

                    <li> <span>byt8.</span>
                        <ol id="sub-list-position">
                            <li>Developer &amp; Creator.</li>
                        </ol> 

                        <ol id="sub-list-description">
                            <li>firebase, google cloud platform, javascript, swift, xcode.</li>
                        </ol>
                    </li>
                    
                    <li> <span>Creatively Innovative.</span>
                        <ol id="sub-list-position">
                            <li>Data Analyst.</li>
                        </ol> 
                        <ol id="sub-list-description">
                            <li>google ads, tableau, python, excel.</li>
                        </ol>
                    </li>

                </ul>
            </div>
        </div>
    );
  }
  
  export default Experience;
  