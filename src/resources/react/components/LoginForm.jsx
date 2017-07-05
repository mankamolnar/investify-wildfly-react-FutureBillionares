import React from 'react'
import {Link} from 'react-router'

export default class LoginForm extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="jumbotron text-center">
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
                        <button type="submit" className="btn btn-success" onClick={this.props.login}>Login</button>
                    </div>
            </div>
        );
    }
}
