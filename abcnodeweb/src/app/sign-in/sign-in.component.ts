import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Router } from '@angular/router'

import { AuthenticationService } from '../authentication/authentication.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  model: any = {};
  loading: Boolean = false;
  constructor(private http:Http, private authenticationService:AuthenticationService, private router: Router) { }

  ngOnInit() {
  }

  public login() {
    this.loading = true;
    this.authenticationService.login(this.model.username, this.model.password)
    .subscribe(result => {
      if (result === true) {
        this.router.navigate(['/accounts']);
      } else {
        this.loading = false;
      }
    });
  }

}
