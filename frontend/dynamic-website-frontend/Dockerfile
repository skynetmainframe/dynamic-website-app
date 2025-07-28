# Stage 1: Build the Angular application
FROM node:20-alpine AS build

WORKDIR /app

COPY package.json package-lock.json ./
RUN npm install --legacy-peer-deps

COPY . .

# Build Angular application
RUN npm run build -- --configuration=production --output-path=./dist/app-output

# Stage 2: Serve with Nginx
FROM nginx:alpine

# Copy the built Angular app from the build stage to Nginx's public directory
COPY --from=build /app/dist/app-output /usr/share/nginx/html

# Copy custom Nginx configuration (optional, for SPA routing, etc.)
# COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
