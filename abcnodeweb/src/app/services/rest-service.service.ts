import { Injectable } from '@angular/core';
import { Http, Headers, Response, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Injectable()
export class RestServiceService {
  public token: string;

  constructor(private http: Http) {
    var currentUser = JSON.parse(localStorage.getItem('currentUser'));
    this.token = currentUser && currentUser.token;
  }

  login(username: string, password:string) : Observable<Boolean> {
    let headers = new Headers({ 'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    return this.http.post('http://localhost:8083/v1/user/authenticate', JSON.stringify({ username: username, password: password }), options)
      .map((response: Response) => {
        let token = response.json() && response.json().token;
        if(token) {
          this.token = token;
          localStorage.setItem('currentUser', JSON.stringify({ username: username, token: this.token }));
          return true;
        } else {
          return false;
        }
    });
  }

  saveOnBoardingDetails(data: object) : Observable<object> {
    let headers = new Headers({ 'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    return this.http.post('http://localhost:8090/v1/user/onboard', JSON.stringify(data), options)
      .map((response: Response) => {
        console.log(response.status);
        return response;
    });
  }
}
