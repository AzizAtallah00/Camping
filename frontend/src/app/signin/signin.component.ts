import { Component } from '@angular/core';
import { User } from '../shared/classes/user';
import { MatDialog } from '@angular/material/dialog';
import { SingupComponent } from '../signup/singup.component';


@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrl: './signin.component.css'
})
export class SigninComponent {
  constructor(private matDialog: MatDialog) { }

  user = {} as User;
  openDialog() {
    this.matDialog.open(SingupComponent, { width: "60%", height: "70%" });
  }
}
