import './experience.css'

function Experience() {
    return (
        <div className="experience-page">
            <h1 className="experience-title">
                EXPERIENCE
            </h1>

            <div className="experience-body">
                <a href="https://github.com/willsather/Will-Sather/blob/master/Website/resume/2020%20Will%20Sather%20Resume%20(PDF).pdf" Style="color:grey" target="_blank">// check out my resume here</a>
            </div>

            <div className="experience-div">
                <ul id="experience-list">
                    <li> <span>Dell Technologies.</span>
                        <ol id="sub-list-position">
                            <li>Systems Engineer Intern.</li>
                        </ol>
                        <ol id="sub-list-description">
                            <li>flutter, firebase, dart.</li>
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
  