import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CobComponent } from './cob.component';

describe('CobComponent', () => {
  let component: CobComponent;
  let fixture: ComponentFixture<CobComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CobComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
