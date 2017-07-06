import React from 'react'
import {Link} from 'react-router'

export default class LoginForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {usernameError: false, passwordError:false};

        this.validateInputs = this.validateInputs.bind(this);
    }

    validateInputs() {
        let user = document.getElementById("user");
        let password = document.getElementById("password");
        let localError = false;

        if (user.value.trim() == "") {
            this.setState({usernameError:true});
            localError = true;
        } else {
            this.setState({usernameError:false});
        }

        if (password.value.trim() == "") {
            this.setState({passwordError:true});
            localError = true;
        } else {
            this.setState({passwordError:false});
        }

        if (!localError) {
            this.props.login(user.value, password.value);
        }

    }

    render() {
        var userError;
        var passwordError;

        if (this.state.usernameError) {
            userError = (
                    <div className="alert alert-danger half block-c small-bottom-margin">
                        <strong>Username is required!</strong> Please fill it and hit login again!<br />
                    </div>
            );
        }

        if (this.state.passwordError) {
            passwordError = (
                <div className="alert alert-danger half block-c small-bottom-margin">
                    <strong>Password is required!</strong> Please fill it and hit login again!
                </div>
            );
        }

        return (
            <div className="jumbotron text-center">

                {passwordError}
                {userError}

                <h1>Login</h1>
                <div className="td-2 title">
                    Username
                </div>
                <div className="td-2">
                    <input type="text" name="user" id="user" className="form-control half" />
                </div>

                <div className="td-2 title newline">
                    Password
                </div>
                <div className="td-2">
                    <input type="password" name="password" id="password" className="form-control half" />
                </div>

                <div className="td-1">
                    <button type="submit" className="btn btn-success" onClick={this.validateInputs}>Login</button>
                </div>
            </div>
        );
    }
}
