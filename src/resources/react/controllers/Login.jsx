import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import LoginForm from '../components/LoginForm';
import AuthService from '../services/AuthService';
import Dashboard from './Dashboard';

export default class Login extends React.Component {
    constructor(props) {
        super(props);
        this.state = {loggedIn:this.props.loggedIn, user:this.props.user};
        this.login = this.login.bind(this)
    }

    login(user, password) {
        this.authService = new AuthService();
        this.authService.authenticate(user, password).then(r => this.props.mainControllerSetState(r));
    }

    render() {
        if (this.props.loggedIn) {
            var content = <Dashboard loggedIn={this.props.loggedIn} login={this.login} />;

        } else {
            var content = <LoginForm loggedIn={this.props.loggedIn} login={this.login} />;

        }
        return (
            <div>
                <NavBar loggedIn={this.props.loggedIn} />
                {content}
            </div>
        );
    }
}