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

  readonly APP_URL = 'http://localhost:8080/SpringProject';

  ngOnInit() {
  }

  getParkUser() {

    this.http.get(this.APP_URL + '/getParkUser').subscribe(data => { this.myUser = data; });

  }

}
