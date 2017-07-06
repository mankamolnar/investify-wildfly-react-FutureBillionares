import React from 'react';
import {Link} from 'react-router';
// *** PAGES ***
export default class RegistrationForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {usernameError: false, passwordError: false, passwordEqualityError: false, emailError: false};
        this.validateInputs = this.validateInputs.bind(this);
    }

    validateInputs() {
        console.log("validate!!!");
        let username = document.getElementById("username");
        let password = document.getElementById("password");
        let password2 = document.getElementById("password2");
        let email = document.getElementById("email");
        let localError = false;

        if (username.value.trim() == "") {
            this.setState({usernameError: true});
            localError = true;
        } else {
            this.setState({usernameError: false});
        }

        if (password.value.trim() == "") {
            this.setState({passwordError: true});
            localError = true;
        } else {
            this.setState({passwordError: false});
        }

        if (password.value.trim() != password2.value.trim()) {
            this.setState({passwordEqualityError: true});
            localError = true;
        } else {
            this.setState({passwordEqualityError: false});
        }

        if (email.value.trim() == "") {
            this.setState({emailError: true});
            localError = true;
        } else {
            this.setState({emailError: false});
        }

        console.log(localError);
        if (!localError) {
            this.props.registrate(username, password, password2, email);
        }
    }

    render() {
        var usernameError;
        var passwordError;
        var passwordEqualityError;
        var emailError;
        var usernameTakenError;
        var emailTakenError;

        if (this.state.usernameError) {
            usernameError = (
            <div className="alert alert-danger half block-c small-bottom-margin">
                <strong>Username is required!</strong> Please fill it and try again!
            <br/>
            </div>
            );
        }

        if (!this.props.regState.usernameOK) {
            usernameTakenError = (
                <div className="alert alert-danger half block-c small-bottom-margin">
                    <strong>Username is already taken!</strong> Please try again!
                    <br/>
                </div>
            );
        }

        if (this.state.passwordError) {
            passwordError = (
                <div className="alert alert-danger half block-c small-bottom-margin">
                    <strong>Password is required!</strong> Please fill it and try again!
                    <br/>
                </div>
            );
        }
        if (this.state.passwordEqualityError) {
            passwordEqualityError = (
                <div className="alert alert-danger half block-c small-bottom-margin">
                    <strong>Passwords aren't equal!</strong> Please try again!
                    <br/>
                </div>
            );
        }
        if (this.state.emailError) {
            emailError = (
                <div className="alert alert-danger half block-c small-bottom-margin">
                    <strong>Email is required!</strong> Please fill it and try again!
                    <br/>
                </div>
            );
        }
        if (!this.props.regState.emailOK) {
            emailTakenError = (
                <div className="alert alert-danger half block-c small-bottom-margin">
                    <strong>Email is already taken!</strong> Please try again!
                    <br/>
                </div>
            );
        }

        return (

            <div className="jumbotron text-center">
                {usernameError}
                {passwordError}
                {passwordEqualityError}
                {emailError}
                {usernameTakenError}
                {emailTakenError}

                <h1>Registration</h1>
                    <div className="td-2 title">
                        Username
                    </div>
                    <div className="td-2">
                        <input type="text" id="username" name="username" className="form-control half"/>
                    </div>

                    <div className="td-2 title newline">
                        Password
                    </div>
                    <div className="td-2">
                        <input type="password" name="password" id="password" className="form-control half"/>
                    </div>

                    <div className="td-2 title newline">
                        Confirm Password
                    </div>
                    <div className="td-2">
                        <input type="password" name="password2" id="password2" className="form-control half"/>
                    </div>

                    <div className="td-2 title">
                        E-mail
                    </div>
                    <div className="td-2">
                        <input type="email" name="email" id="email" className="form-control half"/>
                    </div>

                    <div className="td-1">
                        <button type="submit" className="btn btn-success" onClick={this.validateInputs}>Sign Up</button>
                    </div>
            </div>
        );
    }
}