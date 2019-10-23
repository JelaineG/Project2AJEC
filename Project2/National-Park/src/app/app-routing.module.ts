import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from 'src/app/welcome/welcome.component';
import { NavComponent } from 'src/app/nav/nav.component';
import { LoginComponent } from 'src/app/login/login.component';
import { HomeComponent } from 'src/app/home/home.component';
import { ParklistComponent } from 'src/app/parklist/parklist.component';
import { UserparklistComponent } from 'src/app/userparklist/userparklist.component';
import { RegisterComponent } from 'src/app/register/register.component';

const routes: Routes = [ 
    {path: 'parklist', component: ParklistComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'login', component: LoginComponent},
    {path: 'home', component: HomeComponent},
    {path: 'nationalparks', component: UserparklistComponent},
    {path: '**', pathMatch: 'full', component: WelcomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
