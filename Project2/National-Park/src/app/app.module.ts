import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { UserNavComponent } from './user-nav/user-nav.component';
import { NavComponent } from './nav/nav.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ParklistComponent } from './parklist/parklist.component';
import { UserWishlistComponent } from './user-wishlist/user-wishlist.component';
import { UserparklistComponent } from './userparklist/userparklist.component';
import { RegisterComponent } from './register/register.component';
import { CalendarComponent } from './calendar/calendar.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    UserNavComponent,
    NavComponent,
    LoginComponent,
    HomeComponent,
    ParklistComponent,
    UserWishlistComponent,
    UserparklistComponent,
    RegisterComponent,
    CalendarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
