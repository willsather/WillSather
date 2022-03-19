import { Component, Input } from '@angular/core';

@Component({
  selector: 'nav-bar',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent {
  
  @Input() backgroundColor: string = "white";

  getBackgroundColor(): string {
    if (this.backgroundColor === "black") {
      return "black";
    }
    return "white";
  }

  getTextColor(): string {
    if (this.backgroundColor === "black") {
      return "white";
    }
    return "black";
  }

  getLogo(): string {
    if (this.backgroundColor === "white") {
      return "../../../assets/logo_black.png";
    }
    return "../../../assets/logo_white.png";
  }
}



