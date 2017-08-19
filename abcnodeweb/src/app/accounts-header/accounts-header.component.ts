import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Router } from '@angular/router';

import { AuthenticationService } from '../authentication/authentication.service';

@Component({
  selector: 'app-accounts-header',
  templateUrl: './accounts-header.component.html',
  styleUrls: ['./accounts-header.component.scss']
})
export class AccountsHeaderComponent implements OnInit {

  constructor(private authenticationService:AuthenticationService, private router: Router) { }

  ngOnInit() {
  }

  public logout() {
    localStorage.removeItem('currentUser');
    this.router.navigate(['/aboutUs']);
  }

}
