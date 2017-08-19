import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from '../dashboard/dashboard.component';
import { SignInComponent } from '../sign-in/sign-in.component';
import { AccountsComponent } from '../accounts/accounts.component';
import { AccountStatementComponent } from '../accounts/account-statement/account-statement.component';
import { AuthenticateGuard } from '../guard/authenticate.guard';
import { CobComponent } from '../cob/cob.component';
import { FundTransferComponent } from '../banking/fund-transfer/fund-transfer.component';
import { BenificiaryComponent } from '../banking/benificiary/benificiary.component';

const routes: Routes = [
    { path: 'aboutUs', component: DashboardComponent },
    { path: 'signIn', component: SignInComponent },
    { path: 'accounts/summary', component: AccountsComponent, canActivate: [AuthenticateGuard] },
    { path: 'accounts/viewStatement', component: AccountStatementComponent, canActivate: [AuthenticateGuard] },
    { path: 'banking/fundTransfer', component: FundTransferComponent },
    { path: 'banking/benificiary', component: BenificiaryComponent },
    { path: 'cob', component: CobComponent },
    { path: '**', redirectTo: 'aboutUs' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class BankRoutingModule { }
