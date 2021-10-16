# KotlinMVP
Android application with MVP architecture

This is a simple application which has educational aspect.

The architecture of this program is MVP.

> MVP stands for `Model`, `View`, and `Presenter`.

## Files :
In this project we have 2 parts.

![MVP](https://holosen.net/wp-content/uploads/2021/10/mvp.png)

## Part I

View : `MainActivity`.

Presenter : `MainPresenterImp` that implements `MainPresenter` interface.

Contract : `MainContract` which contains `MainPresenter` and `MainView` interfaces.


## Part II
Model : `UserCredention` that contains `username` and `password`.

View : `LoginActivity`.

Presenter : `LoginPresenterImp` that implements `LoginPresenter` interface.

Contract : `LoginContract` which contains `LoginPresenter` and `LoginView` interfaces.

Core : `LoginInteractor` the brain of the code.


## More information :
You can find more information here : https://www.instagram.com/nulldevelopr/

## Any Question?
Find me on Instagram : https://www.instagram.com/nulldevelopr/

Official Website : https://badrnezhad.com
