import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CharGrouperFormComponent } from './char-grouper-form.component';

describe('CharGrouperFormComponent', () => {
  let component: CharGrouperFormComponent;
  let fixture: ComponentFixture<CharGrouperFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CharGrouperFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CharGrouperFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
