import { Component } from '@angular/core';
import { Router } from "@angular/router";
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Will Sather';

  constructor(private router: Router ) {
  }

  getNavigationColor(): string {

    if (this.router.url === "/about") {
      return "black";
    }
    
    return  "white";
  }
}
