import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AppRoutes } from './app.routes';
import { AboutComponent } from './components/about/about.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
  { path: AppRoutes.HomeBranch, component: HomeComponent },
  { path: AppRoutes.ExperienceBranch, component: ExperienceComponent },
  { path: AppRoutes.AboutBranch, component: AboutComponent },
  { path: "*", component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
