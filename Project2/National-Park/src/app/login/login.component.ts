import { Component, OnInit, Input } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private http: HttpClient) {

   }

  myUser: any;

  readonly APP_URL = 'http://localhost:4200/login';

  ngOnInit() {
  }

  getParkUser() {

    this.http.get(this.APP_URL).subscribe(data => { this.myUser = data; });

  }

}
