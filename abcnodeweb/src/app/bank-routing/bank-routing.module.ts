import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from '../dashboard/dashboard.component';
import { SignInComponent } from '../sign-in/sign-in.component';
import { AccountsComponent } from '../accounts/accounts.component';
import { AuthenticateGuard } from '../guard/authenticate.guard';

const routes: Routes = [
    { path: 'aboutUs', component: DashboardComponent },
    { path: 'signIn', component: SignInComponent },
    { path: 'accounts', component: AccountsComponent, canActivate: [AuthenticateGuard] },
    { path: 'accounts/summary', component: AccountsComponent, canActivate: [AuthenticateGuard] },
    { path: '**', redirectTo: 'aboutUs' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class BankRoutingModule { }
