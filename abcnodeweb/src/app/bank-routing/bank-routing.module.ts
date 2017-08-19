import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from '../dashboard/dashboard.component';
import { SignInComponent } from '../sign-in/sign-in.component';
import { AccountsComponent } from '../accounts/accounts.component';

const routes: Routes = [
    { path: 'aboutUs', component: DashboardComponent },
    { path: 'signIn', component: SignInComponent },
    { path: 'accounts', component: AccountsComponent },
    { path: '**', redirectTo: 'aboutUs' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class BankRoutingModule { }
