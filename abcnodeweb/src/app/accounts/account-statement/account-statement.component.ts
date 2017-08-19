import { Component, OnInit } from '@angular/core';
import { Http, Headers, Response, RequestOptions, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-account-statement',
  templateUrl: './account-statement.component.html',
  styleUrls: ['./account-statement.component.scss']
})
export class AccountStatementComponent implements OnInit {
  statements: any = {};
  constructor(private http: Http) { }

  ngOnInit() {
    this.getStatements();
  }

  getStatements() {
    let headers = new Headers({ 'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers});
    this.http.get('http://localhost:8086/v1/funding', options)
      .subscribe((response: Response) => {
        console.log(response.json());
        this.statements = response.json();
    });
  }
}
