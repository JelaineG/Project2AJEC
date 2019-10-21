import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  API_KEY: '3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF';

  constructor(private httpClient: HttpClient) { }
  
  public getParks(){
    return this.httpClient.get('https://developer.nps.gov/api/v1/parks?=${this.API_KEY}');
  }
}
