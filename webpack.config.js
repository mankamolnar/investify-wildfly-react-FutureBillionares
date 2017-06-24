/**
 *
 * Created by flowerpower on 2017. 06. 13..
 */
var webpack = require('webpack');
var path = require('path');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

module.exports = {
    entry: "./src/resources/react/router.js",
    output: {
        path: './static/',
        filename: "bundle.js"
    },
    module: {
        loaders: [
            // {
            //     test: /\.css$/,
            //     loader: "style!css"
            // },
            {
                test: /\.js?$/,
                include: [
                    path.resolve(__dirname, "./src/main/resources/react")
                ],
                loader: 'babel',
                query: {
                    presets: ['es2015', 'react']
                }
            }
            // {
            //     test: /\.css$/,
            //     loader: ExtractTextPlugin.extract("style-loader", "css-loader")
            // },
            // {
            //     test: /\.less$/,
            //     loader: ExtractTextPlugin.extract("style-loader", "css-loader!less-loader")
            // }
        ]
    },
    plugins: [
        new ExtractTextPlugin("[name].css")
    ]
};
